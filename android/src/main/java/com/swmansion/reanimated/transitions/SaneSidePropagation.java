package com.swmansion.reanimated.transitions;

import android.transition.SidePropagation;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

public class SaneSidePropagation extends SidePropagation {

  @Override
  public long getStartDelay(ViewGroup sceneRoot, Transition transition, TransitionValues startValues, TransitionValues endValues) {
    long delay = super.getStartDelay(sceneRoot, transition, startValues, endValues);
    if (delay != 0) {
      if (endValues == null || getViewVisibility(startValues) == View.VISIBLE) {
        return -delay;
      }
    }
    return delay;
  }

}
