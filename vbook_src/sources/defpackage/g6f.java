package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g6f  reason: default package */
/* loaded from: classes.dex */
public final class g6f extends o3 {
    public static final Parcelable.Creator<g6f> CREATOR = new q4f(5);
    public final Double C;
    public final int a;
    public final String b;
    public final long c;
    public final Long d;
    public final String e;
    public final String f;

    public g6f(long j, Object obj, String str, String str2) {
        am8.p(str);
        this.a = 2;
        this.b = str;
        this.c = j;
        this.f = str2;
        if (obj == null) {
            this.d = null;
            this.C = null;
            this.e = null;
        } else if (obj instanceof Long) {
            this.d = (Long) obj;
            this.C = null;
            this.e = null;
        } else if (obj instanceof String) {
            this.d = null;
            this.C = null;
            this.e = (String) obj;
        } else if (obj instanceof Double) {
            this.d = null;
            this.C = (Double) obj;
            this.e = null;
        } else {
            vs.m("User attribute given of un-supported type");
            throw null;
        }
    }

    public final Object c() {
        Long l = this.d;
        if (l != null) {
            return l;
        }
        Double d = this.C;
        if (d != null) {
            return d;
        }
        String str = this.e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        q4f.a(this, parcel);
    }

    public g6f(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = l;
        this.C = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.e = str2;
        this.f = str3;
    }

    public g6f(j6f j6fVar) {
        this(j6fVar.d, j6fVar.e, j6fVar.c, j6fVar.b);
    }
}
