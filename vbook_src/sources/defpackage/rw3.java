package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: rw3  reason: default package */
/* loaded from: classes.dex */
public final class rw3 {
    /* JADX INFO: Fake field, exist only in values array */
    rw3 EF5;
    public static final /* synthetic */ rw3[] b = {new Enum("invalid_client", 0), new Enum("invalid_grant", 1), new Enum("bad_verification_code", 2), new Enum("invalid_request", 3), new Enum("unauthorized_client", 4), new Enum("unsupported_grant_type", 5), new Enum("access_denied", 6), new Enum("unsupported_response_type", 7), new Enum("invalid_scope", 8), new Enum("server_error", 9), new Enum("temporarily_unavailable", 10)};
    public static final qw3 Companion = new Object();
    public static final ye6 a = ipe.x(sk6.b, new qk3(25));

    public static rw3 valueOf(String str) {
        return (rw3) Enum.valueOf(rw3.class, str);
    }

    public static rw3[] values() {
        return (rw3[]) b.clone();
    }
}
