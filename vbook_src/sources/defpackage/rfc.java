package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rfc  reason: default package */
/* loaded from: classes.dex */
public final class rfc {
    public static final rfc a;
    public static final rfc b;
    public static final rfc c;
    public static final /* synthetic */ rfc[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, rfc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, rfc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, rfc] */
    static {
        ?? r0 = new Enum("Uninitialized", 0);
        a = r0;
        ?? r1 = new Enum("Detached", 1);
        b = r1;
        ?? r2 = new Enum("Attached", 2);
        c = r2;
        d = new rfc[]{r0, r1, r2};
    }

    public static rfc valueOf(String str) {
        return (rfc) Enum.valueOf(rfc.class, str);
    }

    public static rfc[] values() {
        return (rfc[]) d.clone();
    }
}
