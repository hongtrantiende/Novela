package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ar2  reason: default package */
/* loaded from: classes.dex */
public final class ar2 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        String str = a2d.a;
        Locale locale = Locale.US;
        StringBuilder r = hl5.r(i, i2, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        rs8.q(i3, i4, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", r);
        rs8.q(i5, i6, "\n skippedOutputBuffers=", "\n droppedBuffers=", r);
        rs8.q(i7, i8, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", r);
        rs8.q(i9, i10, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", r);
        r.append(j);
        r.append("\n videoFrameProcessingOffsetCount=");
        r.append(i11);
        r.append("\n}");
        return r.toString();
    }
}
