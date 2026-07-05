package defpackage;

import android.os.Parcelable;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d65  reason: default package */
/* loaded from: classes.dex */
public final class d65 extends uo8 {
    public static final Parcelable.Creator<d65> CREATOR = new cxd(13);
    public final List b;
    public final int c;

    public d65(int i, List list, int i2) {
        super(i);
        this.b = list;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d65) {
                d65 d65Var = (d65) obj;
                if (this.a == d65Var.a && this.b.equals(d65Var.b) && this.c == d65Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.uo8
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c;
    }
}
