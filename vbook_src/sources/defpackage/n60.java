package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n60  reason: default package */
/* loaded from: classes.dex */
public final class n60 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ o60 a;

    public n60(o60 o60Var) {
        this.a = o60Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        this.a.c.j.e(-1, new vs(10));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new vs(11));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new vs(10));
    }
}
