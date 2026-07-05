package defpackage;

import android.text.SegmentFinder;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zu  reason: default package */
/* loaded from: classes.dex */
public final class zu extends SegmentFinder {
    public final /* synthetic */ hvc a;

    public zu(hvc hvcVar) {
        this.a = hvcVar;
    }

    public final int nextEndBoundary(int i) {
        return this.a.e(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.a(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.b(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.d(i);
    }
}
