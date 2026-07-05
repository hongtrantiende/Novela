package defpackage;

import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ri5  reason: default package */
/* loaded from: classes3.dex */
public abstract class ri5 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [x88, java.lang.Object] */
    public static final re5 a(lf5 lf5Var, xt4 xt4Var) {
        ye5 ye5Var = new ye5();
        xt4Var.invoke(ye5Var);
        j34 j34Var = new j34(9, ye5Var.d, new qi5(lf5Var, 0));
        ye5Var.d = j34Var;
        ?? obj = new Object();
        obj.a = new bo7(24);
        j34Var.invoke(obj);
        return new re5(new b98(obj), ye5Var);
    }

    public static final String b() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            networkInterfaces.getClass();
            ArrayList list = Collections.list(networkInterfaces);
            list.getClass();
            c00 c00Var = new c00(list, 1);
            oi5 oi5Var = new oi5(1);
            k9a k9aVar = k9a.a;
            String str = (String) g9a.c0(new ki4(3, new ff4(new ki4(c00Var, oi5Var), true, new oi5(2)), new oi5(3)));
            if (str != null) {
                return str;
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }
}
