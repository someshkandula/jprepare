package com.cloudleaf.config;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;
import org.graalvm.polyglot.proxy.ProxyExecutable;
import org.graalvm.polyglot.proxy.ProxyObject;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try(Context ctx = Context.create()) {
            final Map<String, Object> proxy = new HashMap<>();
            proxy.put("sayHello", new ProxyExecutable() {
                @Override
                public Object execute(Value... arguments) {
                    if (arguments.length != 1) {
                        throw new IllegalArgumentException();
                    }

                    System.out.printf("Hello, %s\n", arguments[0].asString());
                    return null;
                }
            });

            ctx.getBindings("js").putMember("bean", ProxyObject.fromMap(proxy));

            ctx.eval("js", "bean.sayHello('World!')");
        }
    }
}