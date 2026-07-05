package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pif  reason: default package */
/* loaded from: classes.dex */
public final class pif implements mif, qjf {
    public static final String i = new String();
    public final Level a;
    public final long b;
    public bjf c;
    public ljf d;
    public ckf e;
    public qxd f;
    public Object[] g;
    public final /* synthetic */ mce h;

    public pif(mce mceVar, Level level) {
        Objects.requireNonNull(mceVar);
        this.h = mceVar;
        mxd.a.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        uaf.D(level, "level");
        this.a = level;
        this.b = nanos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0114  */
    @Override // defpackage.qjf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r19, java.lang.Object[] r20) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pif.a(java.lang.String, java.lang.Object[]):void");
    }

    @Override // defpackage.qjf
    public final qjf b(Throwable th) {
        sjf sjfVar = ajf.a;
        uaf.D(sjfVar, "metadata key");
        if (th != null) {
            d(sjfVar, th);
        }
        return this;
    }

    public final hre c() {
        bjf bjfVar = this.c;
        if (bjfVar != null) {
            return bjfVar;
        }
        return alf.d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, bjf] */
    public final void d(sjf sjfVar, Object obj) {
        if (this.c == null) {
            ?? obj2 = new Object();
            obj2.d = new Object[8];
            obj2.e = 0;
            this.c = obj2;
        }
        this.c.x(sjfVar, obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [jjf, ljf, java.lang.Object] */
    @Override // defpackage.qjf
    public final qjf zzn() {
        ?? obj = new Object();
        obj.b = 0;
        if (this.d == null) {
            this.d = obj;
        }
        return this;
    }
}
