package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u16  reason: default package */
/* loaded from: classes.dex */
public final class u16 {
    public static final u16 a;
    public static final u16 b;
    public static final u16 c;
    public static final u16 d;
    public static final /* synthetic */ u16[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, u16] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, u16] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, u16] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, u16] */
    static {
        ?? r0 = new Enum("IGNORED", 0);
        a = r0;
        ?? r1 = new Enum("SCHEDULED", 1);
        b = r1;
        ?? r2 = new Enum("DEFERRED", 2);
        c = r2;
        ?? r3 = new Enum("IMMINENT", 3);
        d = r3;
        e = new u16[]{r0, r1, r2, r3};
    }

    public static u16 valueOf(String str) {
        return (u16) Enum.valueOf(u16.class, str);
    }

    public static u16[] values() {
        return (u16[]) e.clone();
    }
}
