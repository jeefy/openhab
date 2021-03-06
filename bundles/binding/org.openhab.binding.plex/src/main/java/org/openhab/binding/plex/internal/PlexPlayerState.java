/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.plex.internal;

/**
 * The different states for the Plex clients
 * 
 * @author Jeroen Idserda
 * @since 1.7.0
 */
public enum PlexPlayerState {

    Stopped,
    Buffering,
    Playing,
    Paused;

    public static PlexPlayerState of(String state) {
        for (PlexPlayerState playerState : values()) {
            if (playerState.toString().toLowerCase().equals(state)) {
                return playerState;
            }
        }

        return null;
    }
}
