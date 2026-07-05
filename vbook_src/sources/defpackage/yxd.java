package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yxd  reason: default package */
/* loaded from: classes.dex */
public final class yxd extends cyd {
    public static final yxd b = new yxd(dyd.a);
    public final AtomicReference a;

    public yxd(cyd cydVar) {
        this.a = new AtomicReference(cydVar);
    }

    @Override // defpackage.cyd
    public final void a(String str, Level level, boolean z) {
        ((cyd) this.a.get()).a(str, level, z);
    }

    @Override // defpackage.cyd
    public final myd b() {
        return ((cyd) this.a.get()).b();
    }

    @Override // defpackage.cyd
    public final hre c() {
        return ((cyd) this.a.get()).c();
    }
}
