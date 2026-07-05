package defpackage;

import android.os.Trace;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s0a  reason: default package */
/* loaded from: classes3.dex */
public abstract class s0a implements AutoCloseable {
    public static void o(String str) {
        if (str.length() > 127) {
            str = str.substring(0, Token.IMPORT).concat("...");
        }
        Trace.beginSection(str);
    }
}
