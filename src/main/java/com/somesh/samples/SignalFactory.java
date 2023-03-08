package com.somesh.samples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SignalFactory {

  private Map<String, SensorType> signals;

  public SignalFactory(Set<SensorType> signalSet) {
    createSignal(signalSet);
  }

  public SensorType findSignal(String signalName) {
    return signals.get(signalName);
  }

  private void createSignal(Set<SensorType> signalSet) {
    signals = new HashMap<String, SensorType>();
    signalSet.forEach(signal -> signals.put(signal.getSignalType(), signal));
  }
}
