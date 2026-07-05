package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yoe  reason: default package */
/* loaded from: classes.dex */
public final class yoe {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final k57 a;

    public yoe(k57 k57Var) {
        this.a = k57Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z;
        String str2;
        am8.s(atomicReference);
        if (strArr.length == strArr2.length) {
            z = true;
        } else {
            z = false;
        }
        am8.n(z);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.K()) {
            return str;
        }
        return g(str, ctd.i, ctd.d, b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.K()) {
            return str;
        }
        return g(str, l0e.c, l0e.b, c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.K()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return hl5.n("experiment_id(", str, ")");
        }
        return g(str, s9e.e, s9e.d, d);
    }

    public final String d(ibe ibeVar) {
        String e;
        k57 k57Var = this.a;
        if (!k57Var.K()) {
            return ibeVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(ibeVar.c);
        sb.append(",name=");
        sb.append(a(ibeVar.a));
        sb.append(",params=");
        dbe dbeVar = ibeVar.b;
        if (dbeVar == null) {
            e = null;
        } else if (!k57Var.K()) {
            e = dbeVar.a.toString();
        } else {
            e = e(dbeVar.f());
        }
        sb.append(e);
        return sb.toString();
    }

    public final String e(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.a.K()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(b(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = f((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = f(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb.append(valueOf);
        }
        sb.append("}]");
        return sb.toString();
    }

    public final String f(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = e((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(valueOf);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
