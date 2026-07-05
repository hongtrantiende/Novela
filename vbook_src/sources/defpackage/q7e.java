package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q7e  reason: default package */
/* loaded from: classes.dex */
public class q7e implements e9e, z6e {
    public final HashMap a = new HashMap();

    @Override // defpackage.z6e
    public final e9e b(String str) {
        HashMap hashMap = this.a;
        if (hashMap.containsKey(str)) {
            return (e9e) hashMap.get(str);
        }
        return e9e.u;
    }

    @Override // defpackage.z6e
    public final void c(String str, e9e e9eVar) {
        HashMap hashMap = this.a;
        if (e9eVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, e9eVar);
        }
    }

    @Override // defpackage.e9e
    public e9e d(String str, odd oddVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new p9e(toString());
        }
        return z6e.a(this, new p9e(str), oddVar, arrayList);
    }

    @Override // defpackage.z6e
    public final boolean e(String str) {
        return this.a.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7e)) {
            return false;
        }
        return this.a.equals(((q7e) obj).a);
    }

    @Override // defpackage.e9e
    public final e9e f() {
        q7e q7eVar = new q7e();
        for (Map.Entry entry : this.a.entrySet()) {
            boolean z = entry.getValue() instanceof z6e;
            HashMap hashMap = q7eVar.a;
            if (z) {
                hashMap.put((String) entry.getKey(), (e9e) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((e9e) entry.getValue()).f());
            }
        }
        return q7eVar;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap hashMap = this.a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(String.format("%s: %s,", str, hashMap.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.e9e
    public final String zzc() {
        return "[object Object]";
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
        return new m6e(this.a.keySet().iterator());
    }
}
