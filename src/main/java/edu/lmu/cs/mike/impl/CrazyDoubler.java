package edu.lmu.cs.mike.impl;

import edu.lmu.cs.mike.iface.IntegerDoubler;

public class CrazyDoubler implements IntegerDoubler {

  @Override
  public long doDouble(int i) {
    return i + i + i;
  }
}

