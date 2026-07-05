package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: obf  reason: default package */
/* loaded from: classes.dex */
public final class obf {
    public final Uri a;
    public final o3f b;
    public final d59 c;
    public final qs5 d;

    public obf(Uri uri, o3f o3fVar, d59 d59Var, qs5 qs5Var) {
        this.a = uri;
        this.b = o3fVar;
        this.c = d59Var;
        this.d = qs5Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof obf) {
            obf obfVar = (obf) obj;
            if (this.a.equals(obfVar.a) && this.b.equals(obfVar.b) && this.c.equals(obfVar.c) && this.d.equals(obfVar.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003)) * 1000003) ^ abf.O.hashCode()) * 1000003) ^ 1231) * 1000003) ^ 1237;
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        String o0eVar = this.b.toString();
        int length2 = o0eVar.length();
        abf abfVar = abf.O;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String obj2 = abfVar.toString();
        int length3 = valueOf.length();
        int length4 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 10 + length3 + 13 + length4 + 16 + obj2.length() + 32 + String.valueOf(true).length() + 22);
        nk2.C(sb, "ProtoDataStoreConfig{uri=", obj, ", schema=", o0eVar);
        nk2.C(sb, ", handler=", valueOf, ", migrations=", valueOf2);
        return nk2.v(sb, ", variantConfig=", obj2, ", useGeneratedExtensionRegistry=true, enableTracing=false}");
    }
}
