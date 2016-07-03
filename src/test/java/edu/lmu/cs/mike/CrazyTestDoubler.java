package edu.lmu.cs.mike;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.lang.Override;

import edu.lmu.cs.mike.iface.IntegerDoubler;
import edu.lmu.cs.mike.impl.CrazyDoubler;

public class CrazyTestDoubler {
  @Test
  public void crazyDoubler() {
    CrazyDoubler doubler = new CrazyDoubler();

    assertEquals(15, doubler.doDouble(5));
    assertEquals(30, doubler.doDouble(10));
  }
}
