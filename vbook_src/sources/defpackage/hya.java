package defpackage;

import android.graphics.RectF;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hya  reason: default package */
/* loaded from: classes.dex */
public final class hya extends uo8 {
    public static final Parcelable.Creator<hya> CREATOR = new go8(11);
    public final RectF b;
    public final ArrayList c;

    public hya(int i, RectF rectF, ArrayList arrayList) {
        super(i);
        this.b = rectF;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hya) {
                hya hyaVar = (hya) obj;
                if (this.a != hyaVar.a || !this.b.equals(hyaVar.b) || !this.c.equals(hyaVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.uo8
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
