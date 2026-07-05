package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ro5  reason: default package */
/* loaded from: classes.dex */
public final class ro5 implements zp8 {
    public static final Parcelable.Creator<ro5> CREATOR = new cxd(14);
    public final Bitmap a;
    public final RectF b;

    public ro5(Bitmap bitmap, RectF rectF) {
        this.a = bitmap;
        this.b = rectF;
    }

    @Override // defpackage.zp8, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        RectF rectF = this.b;
        parcel.writeFloat(rectF.left);
        parcel.writeFloat(rectF.top);
        parcel.writeFloat(rectF.right);
        parcel.writeFloat(rectF.bottom);
        parcel.writeParcelable(this.a, i);
    }
}
