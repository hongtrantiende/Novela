package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rfb  reason: default package */
/* loaded from: classes3.dex */
public final class rfb {
    public static final rfb a;
    public static final rfb b;
    public static final /* synthetic */ rfb[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, rfb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, rfb] */
    static {
        ?? r0 = new Enum("Default", 0);
        a = r0;
        ?? r1 = new Enum("Immersive", 1);
        b = r1;
        c = new rfb[]{r0, r1};
    }

    public static rfb valueOf(String str) {
        return (rfb) Enum.valueOf(rfb.class, str);
    }

    public static rfb[] values() {
        return (rfb[]) c.clone();
    }
}
