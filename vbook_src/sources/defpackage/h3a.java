package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h3a  reason: default package */
/* loaded from: classes3.dex */
public final class h3a {
    public static final h3a a;
    public static final h3a b;
    public static final /* synthetic */ h3a[] c;
    /* JADX INFO: Fake field, exist only in values array */
    h3a EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, h3a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, h3a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, h3a] */
    static {
        ?? r0 = new Enum("Full", 0);
        ?? r1 = new Enum("Thumb", 1);
        a = r1;
        ?? r2 = new Enum("Disabled", 2);
        b = r2;
        c = new h3a[]{r0, r1, r2};
    }

    public static h3a valueOf(String str) {
        return (h3a) Enum.valueOf(h3a.class, str);
    }

    public static h3a[] values() {
        return (h3a[]) c.clone();
    }
}
