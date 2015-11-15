#import "FacebookPlugin.h"
#import <Cordova/CDV.h>
#import <FBSDKCoreKit/FBSDKAppEvents.h>
#import <FBSDKCoreKit/FBSDKSettings.h>

@implementation FacebookPlugin

- (void)pluginInitialize {
    [[NSNotificationCenter defaultCenter] addObserver:self
                                             selector:@selector(handleDidBecomeActive:)
                                                 name:UIApplicationDidBecomeActiveNotification
                                               object:nil];
}

- (void)handleDidBecomeActive:(NSNotification*)notification {
    [FBSDKSettings enableLoggingBehavior:FBSDKLoggingBehaviorAppEvents];
    [FBSDKAppEvents activateApp];
}

@end
