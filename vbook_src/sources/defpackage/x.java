package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x  reason: default package */
/* loaded from: classes.dex */
public final class x {
    public final String a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(int i) {
        this("androidx.credentials.TYPE_ABORT_ERROR");
        switch (i) {
            case 1:
                this("androidx.credentials.TYPE_CONSTRAINT_ERROR");
                return;
            case 3:
                this("androidx.credentials.TYPE_DATA_ERROR");
                return;
            case 4:
                this("androidx.credentials.TYPE_ENCODING_ERROR");
                return;
            case 10:
                this("androidx.credentials.TYPE_INVALID_STATE_ERROR");
                return;
            case 12:
                this("androidx.credentials.TYPE_NETWORK_ERROR");
                return;
            case 14:
                this("androidx.credentials.TYPE_NOT_ALLOWED_ERROR");
                return;
            case 16:
                this("androidx.credentials.TYPE_NOT_READABLE_ERROR");
                return;
            case 17:
                this("androidx.credentials.TYPE_NOT_SUPPORTED_ERROR");
                return;
            case 22:
                this("androidx.credentials.TYPE_SECURITY_ERROR");
                return;
            case 24:
                this("androidx.credentials.TYPE_TIMEOUT_ERROR");
                return;
            case 26:
                this("androidx.credentials.TYPE_UNKNOWN_ERROR");
                return;
            default:
                return;
        }
    }

    public x(String str) {
        this.a = str;
    }
}
