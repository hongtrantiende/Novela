package defpackage;

import java.util.HashMap;
import java.util.concurrent.Callable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bse  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bse implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lse b;
    public final /* synthetic */ String c;

    public /* synthetic */ bse(lse lseVar, String str, int i) {
        this.a = i;
        this.b = lseVar;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        String str = this.c;
        lse lseVar = this.b;
        switch (i) {
            case 0:
                return new mxe(new bse(lseVar, str, 1));
            case 1:
                z9e z9eVar = lseVar.b.c;
                a6f.U(z9eVar);
                hqe b1 = z9eVar.b1(str);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", "android");
                hashMap.put("package_name", str);
                ((lte) lseVar.a).d.d0();
                hashMap.put("gmp_version", 161000L);
                if (b1 != null) {
                    String O = b1.O();
                    if (O != null) {
                        hashMap.put("app_version", O);
                    }
                    hashMap.put("app_version_int", Long.valueOf(b1.Q()));
                    hashMap.put("dynamite_version", Long.valueOf(b1.b()));
                }
                return hashMap;
            default:
                hvc hvcVar = new hvc(lseVar, false, str, 15);
                m2f m2fVar = new m2f("internal.remoteConfig", 0);
                m2fVar.b.put("getValue", new mxe(m2fVar, hvcVar));
                return m2fVar;
        }
    }
}
