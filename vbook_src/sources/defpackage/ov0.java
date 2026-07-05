package defpackage;

import com.reader.data.messaging.BroadcastMessagingService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ov0  reason: default package */
/* loaded from: classes.dex */
public final class ov0 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BroadcastMessagingService b;

    public /* synthetic */ ov0(BroadcastMessagingService broadcastMessagingService, int i) {
        this.a = i;
        this.b = broadcastMessagingService;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        BroadcastMessagingService broadcastMessagingService = this.b;
        switch (i) {
            case 0:
                return ((q0a) broadcastMessagingService.getKoin().c.e).e(cm9.a(ib4.class), null, null);
            case 1:
                return ((q0a) broadcastMessagingService.getKoin().c.e).e(cm9.a(dx.class), null, null);
            default:
                return ((q0a) broadcastMessagingService.getKoin().c.e).e(cm9.a(k0d.class), null, null);
        }
    }
}
