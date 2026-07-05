package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v2e  reason: default package */
/* loaded from: classes.dex */
public final class v2e implements e9e {
    public final e9e a;
    public final String b;

    public v2e(String str) {
        this.a = e9e.u;
        this.b = str;
    }

    @Override // defpackage.e9e
    public final e9e d(String str, odd oddVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof v2e) {
                v2e v2eVar = (v2e) obj;
                if (this.b.equals(v2eVar.b) && this.a.equals(v2eVar.a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.e9e
    public final e9e f() {
        return new v2e(this.b, this.a.f());
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.e9e
    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // defpackage.e9e
    public final Double zzd() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // defpackage.e9e
    public final Boolean zze() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // defpackage.e9e
    public final Iterator zzf() {
        return null;
    }

    public v2e(String str, e9e e9eVar) {
        this.a = e9eVar;
        this.b = str;
    }
}
