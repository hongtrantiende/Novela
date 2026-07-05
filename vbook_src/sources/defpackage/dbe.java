package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import org.mozilla.javascript.ES6Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dbe  reason: default package */
/* loaded from: classes.dex */
public final class dbe extends o3 implements Iterable {
    public static final Parcelable.Creator<dbe> CREATOR = new u7e(29);
    public final Bundle a;

    public dbe(Bundle bundle) {
        this.a = bundle;
    }

    public final Object c(String str) {
        return this.a.get(str);
    }

    public final Double d() {
        return Double.valueOf(this.a.getDouble(ES6Iterator.VALUE_PROPERTY));
    }

    public final String e() {
        return this.a.getString("currency");
    }

    public final Bundle f() {
        return new Bundle(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new lwc(this);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.H(parcel, 2, f());
        uue.V(parcel, U);
    }
}
