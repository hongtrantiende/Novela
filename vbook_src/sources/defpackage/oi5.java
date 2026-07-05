package defpackage;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oi5  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class oi5 implements xt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ oi5(int i) {
        this.a = i;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = false;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                yk8 yk8Var = (yk8) obj;
                yk8Var.getClass();
                String e = xk1.e((String) yk8Var.a, true);
                Object obj2 = yk8Var.b;
                if (obj2 != null) {
                    return e + '=' + xk1.e(String.valueOf(obj2), true);
                }
                return e;
            case 1:
                Enumeration<InetAddress> inetAddresses = ((NetworkInterface) obj).getInetAddresses();
                inetAddresses.getClass();
                ArrayList list = Collections.list(inetAddresses);
                list.getClass();
                return new c00(list, 1);
            case 2:
                InetAddress inetAddress = (InetAddress) obj;
                if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return ((InetAddress) obj).getHostAddress();
            case 4:
                return hl5.h(4, (Integer) obj);
            case 5:
                return hl5.h(4, (Integer) obj);
            case 6:
                return hl5.h(4, (Integer) obj);
            case 7:
                return hl5.h(4, (Integer) obj);
            case 8:
                lw8 lw8Var = (lw8) obj;
                return pvcVar;
            case 9:
                ((mu1) obj).getClass();
                return pvcVar;
            case 10:
                ((byte[]) obj).getClass();
                throw new IllegalStateException("Android platform doesn't support SVG format.");
            case 11:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 12:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 13:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 14:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 15:
                ((frb) obj).f(null);
                return pvcVar;
            case 16:
                ((String) obj).getClass();
                return pvcVar;
            case 17:
                ((String) obj).getClass();
                return pvcVar;
            case 18:
                if (((Character) obj).charValue() == '-') {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 19:
                if (((Character) obj).charValue() == '-') {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 20:
                char charValue = ((Character) obj).charValue();
                if (charValue == 'T' || charValue == 't') {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 21:
                if (((Character) obj).charValue() == ':') {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 22:
                if (((Character) obj).charValue() == ':') {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                char charValue2 = ((Character) obj).charValue();
                if ('0' <= charValue2 && charValue2 < ':') {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 24:
                hi1 hi1Var = (hi1) obj;
                hi1Var.getClass();
                hi1Var.a("JsonPrimitive", new o46(new v16(3)));
                hi1Var.a("JsonNull", new o46(new v16(4)));
                hi1Var.a("JsonLiteral", new o46(new v16(5)));
                hi1Var.a("JsonObject", new o46(new v16(6)));
                hi1Var.a("JsonArray", new o46(new v16(7)));
                return pvcVar;
            case 25:
                y36 y36Var = (y36) obj;
                y36Var.getClass();
                y36Var.a = true;
                y36Var.c = true;
                y36Var.e = true;
                y36Var.d = true;
                y36Var.b = false;
                y36Var.f = true;
                y36Var.g = true;
                return pvcVar;
            case 26:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb = new StringBuilder();
                w3b.a((String) entry.getKey(), sb);
                sb.append(':');
                sb.append((k46) entry.getValue());
                return sb.toString();
            case 27:
                y36 y36Var2 = (y36) obj;
                y36Var2.getClass();
                y36Var2.a = true;
                y36Var2.d = true;
                y36Var2.g = true;
                y36Var2.h = true;
                return pvcVar;
            case 28:
                y36 y36Var3 = (y36) obj;
                y36Var3.getClass();
                y36Var3.b = false;
                y36Var3.c = true;
                return pvcVar;
            default:
                li5 li5Var = (li5) obj;
                li5Var.getClass();
                li5Var.c(300000L);
                li5Var.b(30000L);
                li5Var.d(300000L);
                return pvcVar;
        }
    }
}
