package defpackage;

import java.util.Map;
import okhttp3.OkHttpClient;
import org.mozilla.javascript.ES6Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bo7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class bo7 implements xt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ bo7(int i) {
        this.a = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        String valueOf;
        byte[] bArr;
        String h;
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                u2c u2cVar = (u2c) obj;
                u2cVar.getClass();
                return u2cVar.a;
            case 1:
                u2c u2cVar2 = (u2c) obj;
                u2cVar2.getClass();
                return u2cVar2.a;
            case 2:
                return hl5.h(6, (Integer) obj);
            case 3:
                return hl5.h(6, (Integer) obj);
            case 4:
                pn1 pn1Var = (pn1) obj;
                pn1Var.getClass();
                return pn1Var.a;
            case 5:
                pn1 pn1Var2 = (pn1) obj;
                pn1Var2.getClass();
                return pn1Var2.a;
            case 6:
                ll8 ll8Var = (ll8) obj;
                return hl5.i(ll8Var.b, ll8Var.c, "[", ", ", ")");
            case 7:
                return Long.valueOf(((z5a) obj).a);
            case 8:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "[");
                    int i2 = 0;
                    for (byte b : (byte[]) value) {
                        i2++;
                        if (i2 > 1) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) String.valueOf((int) b));
                    }
                    sb.append((CharSequence) "]");
                    valueOf = sb.toString();
                } else {
                    valueOf = String.valueOf(entry.getValue());
                }
                return nk2.v(new StringBuilder("  "), ((e49) entry.getKey()).a, " = ", valueOf);
            case 9:
                l22 l22Var = (l22) obj;
                l22Var.getClass();
                m56.a(l22Var, wq9.d(new bo7(10)));
                return pvcVar;
            case 10:
                y36 y36Var = (y36) obj;
                y36Var.getClass();
                y36Var.c = true;
                return pvcVar;
            case 11:
                return new mr((wz9) obj);
            case 12:
                break;
            case 13:
                hi1 hi1Var = (hi1) obj;
                hi1Var.a("type", c4b.b);
                hi1Var.a(ES6Iterator.VALUE_PROPERTY, aze.m("Any", new o9a[0]));
                break;
            case 14:
                l8a l8aVar = (l8a) obj;
                float f = vz7.a;
                return pvcVar;
            case 15:
                return String.valueOf(((Integer) obj).intValue());
            case 16:
                ye5 ye5Var = (ye5) obj;
                ye5Var.getClass();
                ye5Var.a(e22.b, new bo7(17));
                if (jy.a()) {
                    ye5Var.a(as9.a, new bo7(18));
                }
                return pvcVar;
            case 17:
                b22 b22Var = (b22) obj;
                b22Var.getClass();
                b22Var.a(kz2.b);
                b22Var.a(kv4.b);
                b22Var.a(dl5.a);
                return pvcVar;
            case 18:
                vr9 vr9Var = (vr9) obj;
                vr9Var.getClass();
                vr9Var.a = new r9(2, null);
                return pvcVar;
            case 19:
                ik ikVar = ((m28) obj).a;
                if (ikVar != null) {
                    ikVar.invoke();
                }
                return pvcVar;
            case 20:
                y28 y28Var = (y28) obj;
                y28Var.getClass();
                return y28Var.x();
            case 21:
                tm4 tm4Var = (tm4) obj;
                tm4Var.getClass();
                tm4Var.d(false);
                return pvcVar;
            case 22:
                b27 b27Var = (b27) obj;
                b27Var.getClass();
                String str = (String) ((z17) b27Var.a()).get(1);
                String str2 = (String) ((z17) b27Var.a()).get(2);
                String str3 = (String) ((z17) b27Var.a()).get(3);
                if (c16.i(str3, "1")) {
                    h = "nhất";
                } else if (c16.i(str3, "4")) {
                    h = "tư";
                } else {
                    h = vte.h(str3);
                }
                return eub.o(str, str2, h);
            case 23:
                b27 b27Var2 = (b27) obj;
                b27Var2.getClass();
                return vte.j(b27Var2.c());
            case 24:
                OkHttpClient.Builder builder = (OkHttpClient.Builder) obj;
                builder.getClass();
                builder.i = false;
                builder.j = false;
                builder.f = true;
                return pvcVar;
            case 25:
                ((OkHttpClient) obj).getClass();
                return pvcVar;
            case 26:
                y36 y36Var2 = (y36) obj;
                y36Var2.getClass();
                y36Var2.c = true;
                y36Var2.d = true;
                y36Var2.g = true;
                y36Var2.e = true;
                return pvcVar;
            case 27:
                y36 y36Var3 = (y36) obj;
                y36Var3.getClass();
                y36Var3.c = true;
                y36Var3.b = false;
                return pvcVar;
            case 28:
                ((String) obj).getClass();
                return pvcVar;
            default:
                l8a l8aVar2 = (l8a) obj;
                return pvcVar;
        }
        return pvcVar;
    }
}
