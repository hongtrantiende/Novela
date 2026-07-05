package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u9e  reason: default package */
/* loaded from: classes.dex */
public final class u9e {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ int b;

    public u9e(int i) {
        this.b = i;
    }

    public static q8e c(odd oddVar, List list) {
        nbe nbeVar = nbe.ADD;
        yae.L(2, "FN", list);
        e9e J = ((hvc) oddVar.c).J(oddVar, (e9e) list.get(0));
        e9e J2 = ((hvc) oddVar.c).J(oddVar, (e9e) list.get(1));
        if (J2 instanceof w0e) {
            List g = ((w0e) J2).g();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new q8e(J.zzc(), (ArrayList) g, arrayList, oddVar);
        }
        vs.m(s21.m("FN requires an ArrayValue of parameter names found ", J2.getClass().getCanonicalName()));
        return null;
    }

    public static boolean d(e9e e9eVar, e9e e9eVar2) {
        int i;
        if (e9eVar instanceof z6e) {
            e9eVar = new p9e(e9eVar.zzc());
        }
        if (e9eVar2 instanceof z6e) {
            e9eVar2 = new p9e(e9eVar2.zzc());
        }
        if ((e9eVar instanceof p9e) && (e9eVar2 instanceof p9e)) {
            if (((p9e) e9eVar).a.compareTo(((p9e) e9eVar2).a) < 0) {
                return true;
            }
            return false;
        }
        double doubleValue = e9eVar.zzd().doubleValue();
        double doubleValue2 = e9eVar2.zzd().doubleValue();
        if (!Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && ((doubleValue != 0.0d || doubleValue2 != 0.0d) && ((i != 0 || doubleValue2 != 0.0d) && Double.compare(doubleValue, doubleValue2) < 0))) {
            return true;
        }
        return false;
    }

    public static e9e e(abe abeVar, e9e e9eVar, e9e e9eVar2) {
        if (e9eVar instanceof Iterable) {
            return g(abeVar, ((Iterable) e9eVar).iterator(), e9eVar2);
        }
        vs.m("Non-iterable type in for...of loop.");
        return null;
    }

    public static boolean f(e9e e9eVar, e9e e9eVar2) {
        if (e9eVar.getClass().equals(e9eVar2.getClass())) {
            if ((e9eVar instanceof r9e) || (e9eVar instanceof c8e)) {
                return true;
            }
            if (e9eVar instanceof g4e) {
                if (Double.isNaN(e9eVar.zzd().doubleValue()) || Double.isNaN(e9eVar2.zzd().doubleValue()) || e9eVar.zzd().doubleValue() != e9eVar2.zzd().doubleValue()) {
                    return false;
                }
                return true;
            } else if (e9eVar instanceof p9e) {
                return e9eVar.zzc().equals(e9eVar2.zzc());
            } else {
                if (e9eVar instanceof v1e) {
                    return e9eVar.zze().equals(e9eVar2.zze());
                }
                if (e9eVar != e9eVar2) {
                    return false;
                }
                return true;
            }
        } else if (((e9eVar instanceof r9e) || (e9eVar instanceof c8e)) && ((e9eVar2 instanceof r9e) || (e9eVar2 instanceof c8e))) {
            return true;
        } else {
            boolean z = e9eVar instanceof g4e;
            if (z && (e9eVar2 instanceof p9e)) {
                return f(e9eVar, new g4e(e9eVar2.zzd()));
            }
            boolean z2 = e9eVar instanceof p9e;
            if (z2 && (e9eVar2 instanceof g4e)) {
                return f(new g4e(e9eVar.zzd()), e9eVar2);
            }
            if (e9eVar instanceof v1e) {
                return f(new g4e(e9eVar.zzd()), e9eVar2);
            }
            if (e9eVar2 instanceof v1e) {
                return f(e9eVar, new g4e(e9eVar2.zzd()));
            }
            if ((z2 || z) && (e9eVar2 instanceof z6e)) {
                return f(e9eVar, new p9e(e9eVar2.zzc()));
            }
            if (!(e9eVar instanceof z6e) || (!(e9eVar2 instanceof p9e) && !(e9eVar2 instanceof g4e))) {
                return false;
            }
            return f(new p9e(e9eVar.zzc()), e9eVar2);
        }
    }

    public static e9e g(abe abeVar, Iterator it, e9e e9eVar) {
        if (it != null) {
            while (it.hasNext()) {
                e9e s = abeVar.f((e9e) it.next()).s((w0e) e9eVar);
                if (s instanceof v2e) {
                    v2e v2eVar = (v2e) s;
                    String str = v2eVar.b;
                    if ("break".equals(str)) {
                        return e9e.u;
                    }
                    if ("return".equals(str)) {
                        return v2eVar;
                    }
                }
            }
        }
        return e9e.u;
    }

    public static boolean h(e9e e9eVar, e9e e9eVar2) {
        if (e9eVar instanceof z6e) {
            e9eVar = new p9e(e9eVar.zzc());
        }
        if (e9eVar2 instanceof z6e) {
            e9eVar2 = new p9e(e9eVar2.zzc());
        }
        if (((!(e9eVar instanceof p9e) || !(e9eVar2 instanceof p9e)) && (Double.isNaN(e9eVar.zzd().doubleValue()) || Double.isNaN(e9eVar2.zzd().doubleValue()))) || d(e9eVar2, e9eVar)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0bba  */
    /* JADX WARN: Removed duplicated region for block: B:562:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v100, types: [e9e] */
    /* JADX WARN: Type inference failed for: r10v103, types: [e9e] */
    /* JADX WARN: Type inference failed for: r10v315 */
    /* JADX WARN: Type inference failed for: r10v320 */
    /* JADX WARN: Type inference failed for: r10v340, types: [w0e] */
    /* JADX WARN: Type inference failed for: r10v347, types: [q7e] */
    /* JADX WARN: Type inference failed for: r10v383 */
    /* JADX WARN: Type inference failed for: r10v384 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, odd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.e9e a(java.lang.String r11, defpackage.odd r12, java.util.ArrayList r13) {
        /*
            Method dump skipped, instructions count: 3820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9e.a(java.lang.String, odd, java.util.ArrayList):e9e");
    }

    public final void b(String str) {
        if (this.a.contains(yae.O(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
