package com.reader.data;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class AndroidActionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        if (intent != null && (action = intent.getAction()) != null) {
            switch (action.hashCode()) {
                case -1962111802:
                    if (!action.equals("com.reader.action.download.CANCEL")) {
                        return;
                    }
                    break;
                case -1936488279:
                    if (action.equals("com.reader.action.tts.FAST_REWIND")) {
                        mfb mfbVar = ix3.a;
                        ix3.a(dzb.a);
                        return;
                    }
                    return;
                case -1679625097:
                    if (action.equals("com.reader.action.tts.FAST_FORWARD")) {
                        mfb mfbVar2 = ix3.a;
                        ix3.a(czb.a);
                        return;
                    }
                    return;
                case -1528813959:
                    if (!action.equals("com.reader.action.download.RESUME")) {
                        return;
                    }
                    break;
                case -1468722171:
                    if (action.equals("com.reader.action.tts.DESTROY")) {
                        mfb mfbVar3 = ix3.a;
                        ix3.a(bzb.a);
                        return;
                    }
                    return;
                case -634284500:
                    if (action.equals("com.reader.action.tts.SKIP_TO_NEXT")) {
                        mfb mfbVar4 = ix3.a;
                        ix3.a(hzb.a);
                        return;
                    }
                    return;
                case -634213012:
                    if (action.equals("com.reader.action.tts.SKIP_TO_PREV")) {
                        mfb mfbVar5 = ix3.a;
                        ix3.a(izb.a);
                        return;
                    }
                    return;
                case -387481030:
                    if (action.equals("com.reader.action.test_server.STOP")) {
                        mfb mfbVar6 = ix3.a;
                        ix3.a(mlb.a);
                        return;
                    }
                    return;
                case 58598593:
                    if (action.equals("com.reader.action.tts.PAUSE")) {
                        mfb mfbVar7 = ix3.a;
                        ix3.a(ezb.a);
                        return;
                    }
                    return;
                case 1110376375:
                    if (action.equals("com.reader.action.tts.STOP")) {
                        mfb mfbVar8 = ix3.a;
                        ix3.a(jzb.a);
                        return;
                    }
                    return;
                case 1120656515:
                    if (action.equals("com.reader.action.book_update.CANCEL") && context != null) {
                        lmd b = lmd.b(context);
                        r0f r0fVar = b.b.m;
                        String concat = "CancelWorkByName_".concat("book_update_work");
                        r9a r9aVar = b.d.a;
                        r9aVar.getClass();
                        kve.y(r0fVar, concat, r9aVar, new d61(b, 0));
                        return;
                    }
                    return;
                case 1611287050:
                    if (!action.equals("com.reader.action.download.PAUSE")) {
                        return;
                    }
                    break;
                case 1877451426:
                    if (action.equals("com.reader.action.tts.RESUME")) {
                        mfb mfbVar9 = ix3.a;
                        ix3.a(fzb.a);
                        return;
                    }
                    return;
                default:
                    return;
            }
            String stringExtra = intent.getStringExtra("book_id");
            if (stringExtra != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1962111802) {
                    if (hashCode != -1528813959) {
                        if (hashCode == 1611287050 && action.equals("com.reader.action.download.PAUSE")) {
                            mfb mfbVar10 = ix3.a;
                            ix3.a(new rf3(stringExtra));
                        }
                    } else if (action.equals("com.reader.action.download.RESUME")) {
                        mfb mfbVar11 = ix3.a;
                        ix3.a(new sf3(stringExtra));
                    }
                } else if (action.equals("com.reader.action.download.CANCEL")) {
                    mfb mfbVar12 = ix3.a;
                    ix3.a(new pf3(stringExtra));
                }
            }
        }
    }
}
