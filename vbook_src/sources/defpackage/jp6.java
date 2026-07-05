package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jp6  reason: default package */
/* loaded from: classes3.dex */
public final class jp6 {
    public static final jp6 a;
    public static final jp6 b;
    public static final /* synthetic */ jp6[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [jp6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [jp6, java.lang.Enum] */
    static {
        ?? r0 = new Enum("RestoreCapturedSelection", 0);
        a = r0;
        ?? r1 = new Enum("KeepCurrentSelection", 1);
        b = r1;
        c = new jp6[]{r0, r1};
    }

    public static jp6 valueOf(String str) {
        return (jp6) Enum.valueOf(jp6.class, str);
    }

    public static jp6[] values() {
        return (jp6[]) c.clone();
    }
}
