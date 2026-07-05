package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ahe  reason: default package */
/* loaded from: classes.dex */
public final class ahe extends o3 {
    public static final Parcelable.Creator<ahe> CREATOR = new kbe(7);
    public final int a;
    public final String b;
    public final Intent c;

    public ahe(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    public static ahe c(Activity activity) {
        return new ahe(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahe)) {
            return false;
        }
        ahe aheVar = (ahe) obj;
        if (this.a == aheVar.a && Objects.equals(this.b, aheVar.b) && Objects.equals(this.c, aheVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 4);
        parcel.writeInt(this.a);
        uue.P(parcel, 2, this.b);
        uue.O(parcel, 3, this.c, i);
        uue.V(parcel, U);
    }
}
