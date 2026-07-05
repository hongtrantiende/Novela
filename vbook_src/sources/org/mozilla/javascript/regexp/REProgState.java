package org.mozilla.javascript.regexp;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
class REProgState {
    final REBackTrackData backTrack;
    final int continuationOp;
    final int continuationPc;
    final int index;
    final int max;
    final int min;
    final REProgState previous;

    public REProgState(REProgState rEProgState, int i, int i2, int i3, REBackTrackData rEBackTrackData, int i4, int i5) {
        this.previous = rEProgState;
        this.min = i;
        this.max = i2;
        this.index = i3;
        this.continuationOp = i4;
        this.continuationPc = i5;
        this.backTrack = rEBackTrackData;
    }
}
