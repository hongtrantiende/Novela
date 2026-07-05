package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cu9  reason: default package */
/* loaded from: classes.dex */
public final class cu9 {
    public boolean a;
    public boolean b;
    public final hi2 c;
    public final yp3 d;
    public final List e;
    public final fz1 f;
    public it4 g;

    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, l97] */
    public cu9(hi2 hi2Var, yp3 yp3Var) {
        int i;
        iz1 iz1Var;
        eu9 eu9Var = hi2Var.g;
        k9b k9bVar = hi2Var.c;
        String str = hi2Var.b;
        this.c = hi2Var;
        this.d = yp3Var;
        List list = hi2Var.e;
        this.e = list == null ? ks3.a : list;
        dw9 dw9Var = hi2Var.p;
        if (dw9Var == null) {
            if (k9bVar != null) {
                Context context = hi2Var.a;
                context.getClass();
                l9b d = k9bVar.d(new j9b(context, str, new jm(this, yp3Var.a), false, false));
                d.getClass();
                ?? obj = new Object();
                obj.a = d;
                this.f = new i9b(obj);
            } else {
                vs.m("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
        } else {
            if (str == null) {
                iz1Var = new iz1(new s6f(this, dw9Var));
            } else {
                s6f s6fVar = new s6f(this, dw9Var);
                int ordinal = eu9Var.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        i = 4;
                    } else {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + eu9Var + '\'').toString());
                    }
                } else {
                    i = 1;
                }
                int ordinal2 = eu9Var.ordinal();
                if (ordinal2 != 1 && ordinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + eu9Var + '\'').toString());
                }
                iz1Var = new iz1(s6fVar, str, i);
            }
            this.f = iz1Var;
        }
        boolean z = eu9Var == eu9.c;
        l9b c = c();
        if (c != null) {
            c.setWriteAheadLoggingEnabled(z);
        }
    }

    public static final void a(cu9 cu9Var, cw9 cw9Var) {
        Object gs9Var;
        yp3 yp3Var = cu9Var.d;
        hi2 hi2Var = cu9Var.c;
        eu9 eu9Var = hi2Var.g;
        eu9 eu9Var2 = eu9.c;
        if (eu9Var == eu9Var2) {
            oue.C(cw9Var, "PRAGMA journal_mode = WAL");
        } else {
            oue.C(cw9Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (hi2Var.g == eu9Var2) {
            oue.C(cw9Var, "PRAGMA synchronous = NORMAL");
        } else {
            oue.C(cw9Var, "PRAGMA synchronous = FULL");
        }
        b(cw9Var);
        iw9 h1 = cw9Var.h1("PRAGMA user_version");
        try {
            h1.Z0();
            int i = (int) h1.getLong(0);
            dxe.r(h1, null);
            int i2 = yp3Var.a;
            if (i != i2) {
                oue.C(cw9Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        cu9Var.d(cw9Var);
                    } else {
                        cu9Var.e(cw9Var, i, i2);
                    }
                    oue.C(cw9Var, "PRAGMA user_version = " + i2);
                    gs9Var = pvc.a;
                } catch (Throwable th) {
                    gs9Var = new gs9(th);
                }
                if (!(gs9Var instanceof gs9)) {
                    pvc pvcVar = (pvc) gs9Var;
                    oue.C(cw9Var, "END TRANSACTION");
                }
                Throwable a = hs9.a(gs9Var);
                if (a != null) {
                    oue.C(cw9Var, "ROLLBACK TRANSACTION");
                    throw a;
                }
            }
            cu9Var.f(cw9Var);
        } finally {
        }
    }

    public static void b(cw9 cw9Var) {
        iw9 h1 = cw9Var.h1("PRAGMA busy_timeout");
        try {
            h1.Z0();
            long j = h1.getLong(0);
            dxe.r(h1, null);
            if (j < 3000) {
                oue.C(cw9Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                dxe.r(h1, th);
                throw th2;
            }
        }
    }

    public final l9b c() {
        i9b i9bVar;
        fz1 fz1Var = this.f;
        if (fz1Var instanceof i9b) {
            i9bVar = (i9b) fz1Var;
        } else {
            i9bVar = null;
        }
        if (i9bVar == null) {
            return null;
        }
        return (l9b) i9bVar.a.a;
    }

    public final void d(cw9 cw9Var) {
        cw9Var.getClass();
        iw9 h1 = cw9Var.h1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (h1.Z0()) {
                if (h1.getLong(0) == 0) {
                    z = true;
                }
            }
            dxe.r(h1, null);
            yp3 yp3Var = this.d;
            yp3Var.a(cw9Var);
            if (!z) {
                s8 v = yp3Var.v(cw9Var);
                if (!v.b) {
                    cp8.u(v.c, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            g(cw9Var);
            yp3Var.r(cw9Var);
            for (qi1 qi1Var : this.e) {
                qi1Var.getClass();
                if (cw9Var instanceof h9b) {
                    ((h9b) cw9Var).a.getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                dxe.r(h1, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0097 A[EDGE_INSN: B:117:0x0097->B:39:0x0097 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.cw9 r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cu9.e(cw9, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.cw9 r10) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cu9.f(cw9):void");
    }

    public final void g(cw9 cw9Var) {
        oue.C(cw9Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        oue.C(cw9Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) this.d.b) + "')");
    }

    public cu9(hi2 hi2Var, wr9 wr9Var) {
        this.c = hi2Var;
        this.d = new yp3("", "", -1);
        List list = hi2Var.e;
        ks3 ks3Var = ks3.a;
        this.e = list == null ? ks3Var : list;
        sl1.o0(list == null ? ks3Var : list, new qi1(new cl7(this, 27)));
        Context context = hi2Var.a;
        r18 r18Var = hi2Var.d;
        Executor executor = hi2Var.h;
        Executor executor2 = hi2Var.i;
        List list2 = hi2Var.m;
        List list3 = hi2Var.n;
        context.getClass();
        r18Var.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        throw new g48(0);
    }
}
