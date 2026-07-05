package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nff  reason: default package */
/* loaded from: classes.dex */
public final class nff extends l5e {
    public final tk1 c;
    public final HashMap d;

    public nff(tk1 tk1Var) {
        super("require");
        this.d = new HashMap();
        this.c = tk1Var;
    }

    @Override // defpackage.l5e
    public final e9e g(odd oddVar, List list) {
        e9e e9eVar;
        yae.K(1, "require", list);
        String zzc = ((hvc) oddVar.c).J(oddVar, (e9e) list.get(0)).zzc();
        HashMap hashMap = this.d;
        if (hashMap.containsKey(zzc)) {
            return (e9e) hashMap.get(zzc);
        }
        HashMap hashMap2 = this.c.a;
        if (hashMap2.containsKey(zzc)) {
            try {
                e9eVar = (e9e) ((Callable) hashMap2.get(zzc)).call();
            } catch (Exception unused) {
                vs.k("Failed to create API implementation: ".concat(String.valueOf(zzc)));
                return null;
            }
        } else {
            e9eVar = e9e.u;
        }
        if (e9eVar instanceof l5e) {
            hashMap.put(zzc, (l5e) e9eVar);
        }
        return e9eVar;
    }
}
