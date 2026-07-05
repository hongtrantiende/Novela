package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l5e  reason: default package */
/* loaded from: classes.dex */
public abstract class l5e implements e9e, z6e {
    public final String a;
    public final HashMap b = new HashMap();

    public l5e(String str) {
        this.a = str;
    }

    @Override // defpackage.z6e
    public final e9e b(String str) {
        HashMap hashMap = this.b;
        if (hashMap.containsKey(str)) {
            return (e9e) hashMap.get(str);
        }
        return e9e.u;
    }

    @Override // defpackage.z6e
    public final void c(String str, e9e e9eVar) {
        HashMap hashMap = this.b;
        if (e9eVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, e9eVar);
        }
    }

    @Override // defpackage.e9e
    public final e9e d(String str, odd oddVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new p9e(this.a);
        }
        return z6e.a(this, new p9e(str), oddVar, arrayList);
    }

    @Override // defpackage.z6e
    public final boolean e(String str) {
        return this.b.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5e)) {
            return false;
        }
        l5e l5eVar = (l5e) obj;
        String str = this.a;
        if (str == null) {
            return false;
        }
        return str.equals(l5eVar.a);
    }

    public abstract e9e g(odd oddVar, List list);

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.e9e
    public final String zzc() {
        return this.a;
    }

    @Override // defpackage.e9e
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.e9e
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // defpackage.e9e
    public final Iterator zzf() {
        return new m6e(this.b.keySet().iterator());
    }

    @Override // defpackage.e9e
    public e9e f() {
        return this;
    }
}
