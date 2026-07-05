package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z6e  reason: default package */
/* loaded from: classes.dex */
public interface z6e {
    static e9e a(z6e z6eVar, p9e p9eVar, odd oddVar, ArrayList arrayList) {
        String str = p9eVar.a;
        if (z6eVar.e(str)) {
            e9e b = z6eVar.b(str);
            if (b instanceof l5e) {
                return ((l5e) b).g(oddVar, arrayList);
            }
            vs.m(nk2.u(str, " is not a function"));
            return null;
        } else if ("hasOwnProperty".equals(str)) {
            yae.K(1, "hasOwnProperty", arrayList);
            if (z6eVar.e(((hvc) oddVar.c).J(oddVar, (e9e) arrayList.get(0)).zzc())) {
                return e9e.z;
            }
            return e9e.A;
        } else {
            vs.m(s21.m("Object has no function ", str));
            return null;
        }
    }

    e9e b(String str);

    void c(String str, e9e e9eVar);

    boolean e(String str);
}
