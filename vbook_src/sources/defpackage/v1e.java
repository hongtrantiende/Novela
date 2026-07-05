package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v1e  reason: default package */
/* loaded from: classes.dex */
public final class v1e implements e9e {
    public final boolean a;

    public v1e(Boolean bool) {
        boolean booleanValue;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        this.a = booleanValue;
    }

    @Override // defpackage.e9e
    public final e9e d(String str, odd oddVar, ArrayList arrayList) {
        boolean equals = "toString".equals(str);
        boolean z = this.a;
        if (equals) {
            return new p9e(Boolean.toString(z));
        }
        vs.m(rs8.l(Boolean.toString(z), ".", str, " is not a function."));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof v1e) && this.a == ((v1e) obj).a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e9e
    public final e9e f() {
        return new v1e(Boolean.valueOf(this.a));
    }

    public final int hashCode() {
        return Boolean.valueOf(this.a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    @Override // defpackage.e9e
    public final String zzc() {
        return Boolean.toString(this.a);
    }

    @Override // defpackage.e9e
    public final Double zzd() {
        double d;
        if (true != this.a) {
            d = 0.0d;
        } else {
            d = 1.0d;
        }
        return Double.valueOf(d);
    }

    @Override // defpackage.e9e
    public final Boolean zze() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.e9e
    public final Iterator zzf() {
        return null;
    }
}
