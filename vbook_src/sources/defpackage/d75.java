package defpackage;

import android.os.SystemClock;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d75  reason: default package */
/* loaded from: classes.dex */
public final class d75 extends ji0 {
    public int g;

    @Override // defpackage.c14
    public final void b(long j, long j2, long j3, List list, a47[] a47VarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!a(this.g, elapsedRealtime)) {
            return;
        }
        for (int i = this.b - 1; i >= 0; i--) {
            if (!a(i, elapsedRealtime)) {
                this.g = i;
                return;
            }
        }
        vm1.d();
    }

    @Override // defpackage.c14
    public final int d() {
        return this.g;
    }

    @Override // defpackage.c14
    public final int o() {
        return 0;
    }

    @Override // defpackage.c14
    public final Object r() {
        return null;
    }
}
