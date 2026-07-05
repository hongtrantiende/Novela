package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vz0  reason: default package */
/* loaded from: classes.dex */
public final class vz0 implements k1e {
    public static final fr2 f = new Object();
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0296  */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r20v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vz0(defpackage.o2f r31, defpackage.vf9 r32) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz0.<init>(o2f, vf9):void");
    }

    public int a(eb5 eb5Var, rg rgVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        x65 x65Var = (x65) this.c;
        a75 a75Var = (a75) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            ejf x = ((mu9) this.d).x(eb5Var, rgVar);
            my6 my6Var = (my6) x.b;
            int f2 = my6Var.f();
            for (int i3 = 0; i3 < f2; i3++) {
                z09 z09Var = (z09) my6Var.g(i3);
                if (!z09Var.d && !z09Var.h) {
                }
                z2 = false;
                break;
            }
            z2 = true;
            int f3 = my6Var.f();
            for (int i4 = 0; i4 < f3; i4++) {
                z09 z09Var2 = (z09) my6Var.g(i4);
                if (z2 || ie2.k(z09Var2)) {
                    ((od6) this.b).A(z09Var2.c, (a75) this.e, z09Var2.i, true);
                    if (!a75Var.a.h()) {
                        x65Var.a(z09Var2.a, a75Var, ie2.k(z09Var2));
                        a75Var.clear();
                    }
                }
            }
            boolean b = x65Var.b(x, z);
            if (!x.a) {
                int f4 = my6Var.f();
                for (int i5 = 0; i5 < f4; i5++) {
                    z09 z09Var3 = (z09) my6Var.g(i5);
                    if (!y78.d(ie2.z(z09Var3, true), 0L) && z09Var3.c()) {
                        i = 1;
                        break;
                    }
                }
            }
            i = 0;
            int f5 = my6Var.f();
            int i6 = 0;
            while (true) {
                if (i6 < f5) {
                    if (((z09) my6Var.g(i6)).c()) {
                        i2 = 1;
                        break;
                    }
                    i6++;
                } else {
                    i2 = 0;
                    break;
                }
            }
            int i7 = b | (i << 1) | (i2 << 2);
            this.a = false;
            return i7;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }

    public synchronized void b() {
        try {
            if (this.a) {
                return;
            }
            this.a = true;
            Context context = (Context) this.e;
            if (context != null) {
                ((sm) this.c).b(context);
                context.unregisterComponentCallbacks((gj) this.d);
            }
            ((WeakReference) this.b).clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.k1e
    public String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", (String) this.b);
        jSONObject.put("password", (String) this.c);
        jSONObject.put("returnSecureToken", this.a);
        String str = (String) this.d;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = (String) this.e;
        if (str2 != null) {
            nq2.H(jSONObject, "captchaResponse", str2);
        } else {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        return jSONObject.toString();
    }

    public vz0(v7f v7fVar, vf9 vf9Var) {
        this.a = false;
        v7f.A().equals(v7fVar);
        this.b = v7fVar.t();
        this.c = v7fVar.u();
        int i = ts5.c;
        Object[] objArr = tm9.E;
        int y = v7fVar.y() + 3;
        kue.e(y, "expectedSize");
        kj kjVar = new kj(y);
        for (y7f y7fVar : v7fVar.x()) {
            int G = y7fVar.G();
            int i2 = G - 1;
            if (G == 0) {
                throw null;
            }
            if (i2 == 0) {
                kjVar.v(y7fVar.t(), Long.valueOf(y7fVar.u()));
            } else if (i2 == 1) {
                kjVar.v(y7fVar.t(), Boolean.valueOf(y7fVar.v()));
            } else if (i2 == 2) {
                kjVar.v(y7fVar.t(), Double.valueOf(y7fVar.w()));
            } else if (i2 == 3) {
                kjVar.v(y7fVar.t(), y7fVar.x());
            } else if (i2 == 4) {
                kjVar.v(y7fVar.t(), y7fVar.y().j());
            }
        }
        kjVar.v("__phenotype_server_token", v7fVar.v());
        kjVar.v("__phenotype_snapshot_token", v7fVar.t());
        kjVar.v("__phenotype_configuration_version", Long.valueOf(v7fVar.w()));
        this.d = kjVar.d(false);
        this.e = vf9Var;
    }

    public vz0(r94 r94Var, vq4 vq4Var, lac lacVar, m8b m8bVar, boolean z) {
        this.b = r94Var;
        this.c = vq4Var;
        this.d = lacVar;
        this.e = m8bVar;
        this.a = z;
    }
}
