package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: byc  reason: default package */
/* loaded from: classes.dex */
public final class byc {
    public static final byc a;
    public static final byc b;
    public static final /* synthetic */ byc[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, byc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, byc] */
    static {
        ?? r0 = new Enum("SUCCESS", 0);
        a = r0;
        ?? r1 = new Enum("END_OF_BODY", 1);
        b = r1;
        c = new byc[]{r0, r1};
    }

    public static byc[] values() {
        return (byc[]) c.clone();
    }
}
