package com.google.ads.interactivemedia.v3.impl.data;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl$AutoPlayState;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl$ContinuousPlayState;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl$MutePlayState;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_GsonAdsRequest;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class GsonAdsRequest {
    private static final boolean SUPPORTS_NATIVE_CLICK_SIGNALS = true;
    private static final boolean SUPPORTS_NATIVE_NETWORKING = true;
    private static final boolean SUPPORTS_NATIVE_VIEW_SIGNALS = true;
    private static final boolean SUPPORTS_QUICKSILVER = true;
    private static final boolean SUPPORTS_WRAPPED_COMPANIONS = true;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public interface Builder {
        Builder adTagParameters(Map<String, String> map);

        Builder adTagUrl(String str);

        Builder adsResponse(String str);

        Builder apiKey(String str);

        Builder assetKey(String str);

        Builder authToken(String str);

        GsonAdsRequest build();

        Builder companionSlots(Map<String, String> map);

        Builder consentSettings(Map<String, String> map);

        Builder contentDuration(Float f);

        Builder contentKeywords(List<String> list);

        Builder contentSourceId(String str);

        Builder contentSourceUrl(String str);

        Builder contentTitle(String str);

        Builder contentUrl(String str);

        Builder customAssetKey(String str);

        Builder customUiOptions(CustomUiOptionsData customUiOptionsData);

        Builder daiIntegration(Integer num);

        Builder enableNonce(Boolean bool);

        Builder env(String str);

        Builder format(String str);

        Builder identifierInfo(IdentifierInfo identifierInfo);

        Builder isAndroidTvAdsFramework(Boolean bool);

        Builder isTv(Boolean bool);

        Builder linearAdSlotHeight(Integer num);

        Builder linearAdSlotWidth(Integer num);

        Builder liveStreamEventId(String str);

        Builder liveStreamPrefetchSeconds(Float f);

        Builder marketAppInfo(MarketAppInfo marketAppInfo);

        Builder msParameter(String str);

        Builder network(String str);

        Builder networkCode(String str);

        Builder oAuthToken(String str);

        Builder omidAdSessionsOnStartedOnly(Boolean bool);

        Builder pauseAdSlot(String str);

        Builder pixelDensity(Double d);

        Builder platformSignals(Map<String, String> map);

        Builder preferredLinearOrientation(Integer num);

        Builder projectNumber(String str);

        Builder region(String str);

        Builder rubidiumApiVersion(int i);

        Builder secureSignals(List<SecureSignalsData> list);

        Builder settings(ImaSdkSettingsData imaSdkSettingsData);

        Builder streamActivityMonitorId(String str);

        Builder supportsExternalNavigation(Boolean bool);

        Builder supportsIconClickFallback(Boolean bool);

        Builder supportsNativeClickSignals(Boolean bool);

        Builder supportsNativeNetworking(Boolean bool);

        Builder supportsNativeViewSignals(Boolean bool);

        Builder supportsOmidJsManagedAppSessions(Boolean bool);

        Builder supportsQuicksilver(Boolean bool);

        Builder supportsResizing(Boolean bool);

        Builder useQAStreamBaseUrl(Boolean bool);

        Builder usesCustomVideoPlayback(Boolean bool);

        Builder vastLoadTimeout(Float f);

        Builder videoContinuousPlay(AdsRequestImpl$ContinuousPlayState adsRequestImpl$ContinuousPlayState);

        Builder videoEnvironment(VideoEnvironmentData videoEnvironmentData);

        Builder videoId(String str);

        Builder videoPlayActivation(AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState);

        Builder videoPlayMuted(AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState);

        Builder videoStitcherSessionOptions(Map<String, Object> map);

        Builder vodConfigId(String str);

        Builder wrappedCompanionsEnabled(Boolean bool);
    }

    public static Builder builder() {
        return new AutoValue_GsonAdsRequest.Builder();
    }

    public static GsonAdsRequest create(p8 p8Var, String str, Map<String, String> map, List<SecureSignalsData> list, Map<String, String> map2, String str2, VideoEnvironmentData videoEnvironmentData, uce uceVar, MarketAppInfo marketAppInfo, boolean z, boolean z2, m6f m6fVar, IdentifierInfo identifierInfo, y6 y6Var, boolean z3, float f) {
        p8Var.a();
        p8Var.d();
        throw new ClassCastException();
    }

    public static GsonAdsRequest createFromStreamRequest(k1b k1bVar, String str, Map<String, String> map, List<SecureSignalsData> list, Map<String, String> map2, String str2, VideoEnvironmentData videoEnvironmentData, uce uceVar, MarketAppInfo marketAppInfo, boolean z, boolean z2, m6f m6fVar, IdentifierInfo identifierInfo, f1b f1bVar, boolean z3, float f) {
        String str3;
        if (f1bVar == null) {
            Map<String, String> companionSlots = getCompanionSlots(null);
            String pauseAdSlot = getPauseAdSlot(null);
            ViewGroup b = f1bVar.b();
            int format = k1bVar.getFormat();
            Builder builder = builder();
            if (k1bVar.q()) {
                builder.useQAStreamBaseUrl(Boolean.valueOf(k1bVar.q()));
            }
            builder.adTagParameters(k1bVar.r());
            builder.apiKey(k1bVar.u());
            builder.assetKey(k1bVar.f());
            builder.authToken(k1bVar.k());
            builder.companionSlots(companionSlots);
            builder.consentSettings(map);
            builder.contentSourceId(k1bVar.j());
            builder.contentUrl(k1bVar.o());
            builder.customAssetKey(k1bVar.l());
            d3e extractDaiIntegration = extractDaiIntegration(k1bVar);
            if (extractDaiIntegration != d3e.UNRECOGNIZED) {
                builder.daiIntegration(Integer.valueOf(extractDaiIntegration.a));
                builder.enableNonce(Boolean.valueOf(k1bVar.g()));
                builder.env(str);
                builder.secureSignals(list);
                if (format == 1) {
                    str3 = "dash";
                } else {
                    str3 = "hls";
                }
                builder.format(str3);
                builder.identifierInfo(identifierInfo);
                Boolean valueOf = Boolean.valueOf(z);
                builder.isTv(valueOf);
                builder.isAndroidTvAdsFramework(Boolean.valueOf(z2));
                builder.pauseAdSlot(pauseAdSlot);
                Boolean bool = Boolean.TRUE;
                builder.wrappedCompanionsEnabled(bool);
                builder.linearAdSlotWidth(Integer.valueOf(b.getWidth()));
                builder.linearAdSlotHeight(Integer.valueOf(b.getHeight()));
                builder.liveStreamEventId(k1bVar.b());
                builder.marketAppInfo(marketAppInfo);
                builder.msParameter((String) m6fVar.a());
                builder.network(str2);
                builder.videoEnvironment(videoEnvironmentData);
                builder.networkCode(k1bVar.c());
                builder.contentSourceUrl(k1bVar.v());
                builder.adTagUrl(k1bVar.a());
                builder.oAuthToken(k1bVar.i());
                builder.omidAdSessionsOnStartedOnly(bool);
                builder.pixelDensity(Double.valueOf(f));
                builder.platformSignals(map2);
                builder.projectNumber(k1bVar.t());
                builder.region(k1bVar.s());
                builder.settings(ImaSdkSettingsData.createFromImaSdkSettingsImpl(uceVar));
                builder.streamActivityMonitorId(k1bVar.h());
                builder.supportsExternalNavigation(Boolean.valueOf(!z));
                builder.supportsIconClickFallback(valueOf);
                builder.supportsNativeClickSignals(bool);
                builder.supportsNativeNetworking(bool);
                builder.supportsNativeViewSignals(bool);
                builder.supportsOmidJsManagedAppSessions(Boolean.valueOf(z3));
                f1bVar.a();
                builder.supportsResizing(Boolean.FALSE);
                builder.videoId(k1bVar.p());
                builder.videoStitcherSessionOptions(k1bVar.m());
                builder.customUiOptions(getCustomUiOptionsData(k1bVar));
                builder.vodConfigId(k1bVar.e());
                builder.rubidiumApiVersion(qka.C());
                return builder.build();
            }
            extractDaiIntegration.getClass();
            vs.m("Can't get the number of an unknown enum value.");
            return null;
        }
        vm1.h();
        return null;
    }

    private static d3e extractDaiIntegration(k1b k1bVar) {
        return d3e.DAI_INTEGRATION_UNSPECIFIED;
    }

    private static Map<String, String> getCompanionSlots(xae xaeVar) {
        throw null;
    }

    private static CustomUiOptionsData getCustomUiOptionsData(k1b k1bVar) {
        if (k1bVar.n() == null) {
            return null;
        }
        return CustomUiOptionsData.createFromCustomUiOptions(k1bVar.n());
    }

    private static String getPauseAdSlot(xae xaeVar) {
        throw null;
    }

    public abstract l8f adTagParameters();

    public abstract String adTagUrl();

    public abstract String adsResponse();

    public abstract String apiKey();

    public abstract String assetKey();

    public abstract String authToken();

    public abstract l8f companionSlots();

    public abstract l8f consentSettings();

    public abstract Float contentDuration();

    public abstract a8f contentKeywords();

    public abstract String contentSourceId();

    public abstract String contentSourceUrl();

    public abstract String contentTitle();

    public abstract String contentUrl();

    public abstract String customAssetKey();

    public abstract CustomUiOptionsData customUiOptions();

    public abstract Integer daiIntegration();

    public abstract Boolean enableNonce();

    public abstract String env();

    public abstract String format();

    public abstract IdentifierInfo identifierInfo();

    public abstract Boolean isAndroidTvAdsFramework();

    public abstract Boolean isTv();

    public abstract Integer linearAdSlotHeight();

    public abstract Integer linearAdSlotWidth();

    public abstract String liveStreamEventId();

    public abstract Float liveStreamPrefetchSeconds();

    public abstract MarketAppInfo marketAppInfo();

    public abstract String msParameter();

    public abstract String network();

    public abstract String networkCode();

    public abstract String oAuthToken();

    public abstract Boolean omidAdSessionsOnStartedOnly();

    public abstract String pauseAdSlot();

    public abstract Double pixelDensity();

    public abstract l8f platformSignals();

    public abstract Integer preferredLinearOrientation();

    public abstract String projectNumber();

    public abstract String region();

    public abstract int rubidiumApiVersion();

    public abstract a8f secureSignals();

    public abstract ImaSdkSettingsData settings();

    public abstract String streamActivityMonitorId();

    public abstract Boolean supportsExternalNavigation();

    public abstract Boolean supportsIconClickFallback();

    public abstract Boolean supportsNativeClickSignals();

    public abstract Boolean supportsNativeNetworking();

    public abstract Boolean supportsNativeViewSignals();

    public abstract Boolean supportsOmidJsManagedAppSessions();

    public abstract Boolean supportsQuicksilver();

    public abstract Boolean supportsResizing();

    public abstract Boolean useQAStreamBaseUrl();

    public abstract Boolean usesCustomVideoPlayback();

    public abstract Float vastLoadTimeout();

    public abstract AdsRequestImpl$ContinuousPlayState videoContinuousPlay();

    public abstract VideoEnvironmentData videoEnvironment();

    public abstract String videoId();

    public abstract AdsRequestImpl$AutoPlayState videoPlayActivation();

    public abstract AdsRequestImpl$MutePlayState videoPlayMuted();

    public abstract l8f videoStitcherSessionOptions();

    public abstract String vodConfigId();

    public abstract Boolean wrappedCompanionsEnabled();
}
