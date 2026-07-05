package defpackage;

import android.os.SystemClock;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: thf  reason: default package */
/* loaded from: classes.dex */
public final class thf extends nc2 {
    public final /* synthetic */ int i;

    public /* synthetic */ thf(int i) {
        this.i = i;
    }

    @Override // defpackage.nc2
    public final long n() {
        switch (this.i) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
