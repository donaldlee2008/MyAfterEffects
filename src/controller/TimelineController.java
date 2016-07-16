/**
 * Copyright (C) 2015 Kasper Kronborg Isager.
 */
package controller;

import framework.Application;
import framework.Controller;
import framework.Timeline;
import model.TimelineModel;
import view.TimelineView;

public final class TimelineController extends Controller<TimelineModel, TimelineView> {

  public TimelineController(final Application application) {
    super(application);

    this.on("timeline:clear", (data) -> this.clear());
    this.on("menu:new", (File f) -> this.clear());
  }

  public void create(final Timeline timeline) throws NullPointerException {
    if (timeline == null) {
      throw new NullPointerException();
    }

    // Update the model with the newly created todo item.
    this.model().add(timeline);
  }

  public void clear() {
    this.model().clear();
  }
}