package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f24  reason: default package */
/* loaded from: classes3.dex */
public final class f24 {
    public static final f24 a;
    public static final f24 b;
    public static final /* synthetic */ f24[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, f24] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, f24] */
    static {
        ?? r0 = new Enum("AllChapters", 0);
        a = r0;
        ?? r1 = new Enum("Custom", 1);
        b = r1;
        c = new f24[]{r0, r1};
    }

    public static f24 valueOf(String str) {
        return (f24) Enum.valueOf(f24.class, str);
    }

    public static f24[] values() {
        return (f24[]) c.clone();
    }
}
