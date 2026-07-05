package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jw3  reason: default package */
/* loaded from: classes.dex */
public enum jw3 implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);
    
    public static final Parcelable.Creator<jw3> CREATOR = new q4f(11);
    public final int a;

    jw3(int i) {
        this.a = i;
    }

    public static jw3 a(int i) {
        jw3[] values;
        for (jw3 jw3Var : values()) {
            if (i == jw3Var.a) {
                return jw3Var;
            }
        }
        Locale locale = Locale.US;
        throw new Exception(hl5.l("Error code ", " is not supported", i));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
