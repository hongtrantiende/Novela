package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uc  reason: default package */
/* loaded from: classes3.dex */
public final class uc {
    public static final uc a;
    public static final /* synthetic */ uc[] b;
    /* JADX INFO: Fake field, exist only in values array */
    uc EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, uc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, uc] */
    static {
        ?? r0 = new Enum("AM", 0);
        ?? r1 = new Enum("PM", 1);
        a = r1;
        b = new uc[]{r0, r1};
    }

    public static uc valueOf(String str) {
        return (uc) Enum.valueOf(uc.class, str);
    }

    public static uc[] values() {
        return (uc[]) b.clone();
    }
}
