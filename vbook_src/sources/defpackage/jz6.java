package defpackage;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jz6  reason: default package */
/* loaded from: classes.dex */
public final class jz6 implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    public final /* synthetic */ kz6 a;

    public jz6(kz6 kz6Var) {
        this.a = kz6Var;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        this.a.b.getClass();
        return bundle;
    }
}
