package org.osgl.oms.handler.builtin.controller;

import org.osgl.oms.handler.RequestHandlerBase;

/**
 * For any handler that does not require the framework to parse incoming request
 * and construct the sessions, it shall extends from this class
 */
public abstract class FastRequestHandler extends RequestHandlerBase {
    @Override
    public boolean requireResolveContext() {
        return false;
    }
}
