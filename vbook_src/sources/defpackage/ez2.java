package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ez2  reason: default package */
/* loaded from: classes3.dex */
public abstract class ez2 {
    public static final pw6 a = sw6.b("io.ktor.websocket.WebSocket");
    public static final i82 b = new i82("ws-incoming-processor");
    public static final i82 c = new i82("ws-outgoing-processor");
    public static final dk1 d;

    static {
        Integer num;
        r0f r0fVar = ck1.b;
        d = new dk1((short) 1000, "OK");
        String property = System.getProperty("io.ktor.websocket.outgoingChannelCapacity");
        if (property != null) {
            num = Integer.valueOf(Integer.parseInt(property));
        } else {
            num = null;
        }
        if (num != null) {
            new va1(num.intValue());
        }
    }
}
